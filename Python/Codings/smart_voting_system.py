import json

class InvalidVoteData(Exception):
    pass
def process_votes(vote_dict):
    valid_votes = []

def main():

    try:
        data = input().strip()
        vote_dict = json.loads(data)
        if not isinstance(vote_dict, dict):
            raise InvalidVoteData("All votes are invalid or maliformed")
        results = process_votes(vote_dict)
    except InvalidVoteData as e:
        print(f"Error: {e}")
    except Exception:
        print("Error: Invalid input format")

